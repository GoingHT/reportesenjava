package com.ale.reportesestudiantes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class moduloReportes extends JFrame {

    public moduloReportes() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Módulo de Reportes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        
        JMenu reportMenu = new JMenu("Reportes");
        
        JMenuItem reporteGeneral = new JMenuItem("Reporte General de Estudiantes");
        reporteGeneral.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarReporteGeneral();
            }
        });

        JMenuItem reportePorEstado = new JMenuItem("Reporte de Estudiantes por Estados");
        reportePorEstado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarReportePorEstados();
            }
        });

        JMenuItem reporteIndividual = new JMenuItem("Reporte Individual por Estudiante");
        reporteIndividual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarReporteIndividual();
            }
        });

        reportMenu.add(reporteGeneral);
        reportMenu.add(reportePorEstado);
        reportMenu.add(reporteIndividual);
        menuBar.add(reportMenu);
        
        setJMenuBar(menuBar);
    }

    private void mostrarReporteGeneral() {
        // Aquí se pueden crear los datos del reporte:
        String titulo = "Reporte General de Estudiantes";
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        String contenido = "Contenido del reporte general..."; // Aquí irían los datos reales
        
        JOptionPane.showMessageDialog(this, titulo + "\nFecha: " + fecha + "\n\n" + contenido, 
            "Reporte General de Estudiantes", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mostrarReportePorEstados() {
        String titulo = "Reporte de Estudiantes por Estados";
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        String contenido = "Contenido del reporte por estados..."; // Aquí irían los datos reales
        
        JOptionPane.showMessageDialog(this, titulo + "\nFecha: " + fecha + "\n\n" + contenido, 
            "Reporte de Estudiantes por Estados", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mostrarReporteIndividual() {
        // Simulación de obtención del nombre del estudiante
        String nombreEstudiante = JOptionPane.showInputDialog(this, "Ingrese el nombre del estudiante:");
        
        // Simulando datos del estudiante
        String titulo = "Reporte Individual de " + nombreEstudiante;
        String fecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        String contenido = "Nombre: " + nombreEstudiante + "\nNotas: A, B, C"; // Aquí irían los datos reales
        
        JOptionPane.showMessageDialog(this, titulo + "\nFecha: " + fecha + "\n\n" + contenido, 
            "Reporte Individual por Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moduloReportes().setVisible(true);
            }
        });
    }
}
