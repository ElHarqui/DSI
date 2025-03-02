
package Logica;

import DAO.ConexionBD;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

public class GenerarComprobante {
    public static void main(String[] args) {
        String pdfPath = "comprobante.pdf";
        String query = "SELECT id, nombre, monto, fecha FROM pagos WHERE id = ?";
        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement pst = con.prepareStatement(query)){
            
            pst.setInt(1, 1); // Cambia el ID según sea necesario
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // Obtener datos de la base de datos
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                double monto = rs.getDouble("monto");
                String fecha = rs.getString("fecha");

                // Crear documento PDF
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(pdfPath));
                document.open();

                // Agregar título centrado
                Font tituloFont = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
                Paragraph titulo = new Paragraph("COMPROBANTE DE PAGO", tituloFont);
                titulo.setAlignment(Element.ALIGN_CENTER);
                document.add(titulo);

                document.add(new Paragraph("\n"));

                // Crear tabla
                PdfPTable table = new PdfPTable(2);
                table.setWidthPercentage(100);
                table.setSpacingBefore(10f);

                // Agregar encabezados con color de fondo
                table.addCell(crearCelda("Campo", true));
                table.addCell(crearCelda("Valor", true));

                // Agregar datos
                table.addCell(crearCelda("ID", false));
                table.addCell(crearCelda(String.valueOf(id), false));

                table.addCell(crearCelda("Nombre", false));
                table.addCell(crearCelda(nombre, false));

                table.addCell(crearCelda("Monto", false));
                table.addCell(crearCelda("S/ " + monto, false));

                table.addCell(crearCelda("Fecha", false));
                table.addCell(crearCelda(fecha, false));

                document.add(table);
                document.close();

                System.out.println("PDF generado correctamente en: " + pdfPath);
            } else {
                System.out.println("No se encontró el pago.");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para crear celdas con estilo
    private static PdfPCell crearCelda(String texto, boolean esEncabezado) {
        Font font = new Font(Font.FontFamily.HELVETICA, 12, esEncabezado ? Font.BOLD : Font.NORMAL);
        PdfPCell cell = new PdfPCell(new Phrase(texto, font));
        cell.setPadding(5);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        if (esEncabezado) {
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        }
        return cell;
    }
}
