package ui;
import java.sql.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try {
            
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/javaMarket?useSSL=false&allowPublicKeyRetrieval=true",
                "root",
                "root"
            );

           
            Scanner scanner = new Scanner(System.in);
            int option;
            do {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Listar todos los productos");
                System.out.println("2. Mostrar los datos de un producto");
                System.out.println("3. Cargar un nuevo producto");
                System.out.println("4. Eliminar un producto");
                System.out.println("5. Modificar un producto");
                System.out.println("0. Salir");
                option = scanner.nextInt();
                scanner.nextLine(); 
                System.out.println(); 
                switch (option) {
                    case 1:
                        listProducts(conn);
                        break;
                    case 2:
                        searchProduct(conn, scanner);
                        break;
                    case 3:
                        newProduct(conn, scanner);
                        break;
                    case 4:
                        deleteProduct(conn, scanner);
                        break;
                    case 5:
                        updateProduct(conn, scanner);
                        break;
                    case 0:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
                System.out.println(); 
            } while (option != 0);

            
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    