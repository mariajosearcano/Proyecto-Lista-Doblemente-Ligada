
package proyecto.lista.doblemente.ligada;

import java.util.Scanner;


public class ProyectoListaDoblementeLigada {

    public static void main(String[] args) {
       
        int d;
        char Opc, Opc2, Opc3, Opc4, Opc5, Opc6;
        String OpL, OpL2, OpL3, OpL4, OpL5, OpL6, OpL7, OpL8, OpL9, OpL10, OpL11, OpL12;
        Lista L1, L2;
        Scanner leer;
        boolean Ban;
        
        Ban = false;
        leer = new Scanner(System.in);
        
        L1 = new Lista(); //Instancia: Instanciar es crear un objeto desde la clase lista
        L2 = new Lista();
        
        do{
            System.out.println("\nMENÚ LISTA DOBLEMENTE LIGADA");
            System.out.println("1. Crear lista");
            System.out.println("2. Ordenar lista");
            System.out.println("3. Buscar");
            System.out.println("4. Múltiplicar listas");
            System.out.println("5. Intercalar listas");
            System.out.println("6. Mostrar Lista");
            System.out.println("7. Salir");
            System.out.print("R/ ");
            Opc = leer.next().charAt(0);
            leer.nextLine();
            
            switch (Opc) 
            {
                case '1':
                            do 
                            {
                                System.out.println("\nMENÚ CREAR LISTA");
                                System.out.println("1. Insertar Inicio");
                                System.out.println("2. Insertar Final");
                                System.out.println("3. Insertar Ordenado");
                                System.out.println("4. Salir");
                                System.out.print("R/ ");
                                Opc2 = leer.next().charAt(0);
                                leer.nextLine();
                                
                                switch (Opc2)
                                {
                                    case '1':
                                                System.out.println("Ingrese el dato que desea insertar en la lista: ");
                                                d = leer.nextInt();
                                                leer.nextLine();
                                                
                                                System.out.println("¿En que lista desea insertar al inicio el dato? (L1 o L2): ");
                                                OpL = leer.nextLine();
                                                leer.nextLine();
                                                
                                                if (OpL.equals("L1"))
                                                {
                                                    Ban = true;
                                                    
                                                    L1.Insertar_Inicio(d, Ban);
                                                }
                                                else if (OpL.equals("L2"))
                                                {
                                                    Ban = true;
                                                    
                                                    L2.Insertar_Inicio(d, Ban);
                                                }
                                                else 
                                                {
                                                    System.out.println("Opción inválida");
                                                }
                                        break;
                                
                                    case '2':
                                                System.out.println("Ingrese el dato que desea insertar en la lista: ");
                                                d = leer.nextInt();
                                                leer.nextLine();
                                        
                                                System.out.println("¿En que lista desea insertar al final el dato? (L1 o L2): ");
                                                OpL2 = leer.nextLine();
                                                leer.nextLine();
                                                
                                                if (OpL2.equals("L1"))
                                                {
                                                    Ban = true;
                                                    
                                                    L1.Insertar_Final(d, Ban);
                                                }
                                                else if (OpL2.equals("L2"))
                                                {
                                                    Ban = true;
                                                    
                                                    L2.Insertar_Final(d, Ban);
                                                }
                                                else 
                                                {
                                                    System.out.println("Opción inválida");
                                                }
                                        break;
                                    
                                    case '3':
                                                do 
                                                {
                                                    System.out.println("\nMENÚ INSERTAR ORDENADO");
                                                    System.out.println("1. Ascendente");
                                                    System.out.println("2. Descendente");
                                                    System.out.println("3. Salir");
                                                    System.out.print("R/ ");
                                                    Opc3 = leer.next().charAt(0);
                                                    leer.nextLine();
                                                    
                                                    switch (Opc3)
                                                    {
                                                        case '1':
                                                                    System.out.println("Ingrese el dato que desea insertar en la lista: ");
                                                                    d = leer.nextInt();
                                                                    leer.nextLine();
                                                                    
                                                                    System.out.println("¿En que lista desea insertar ordenadamente ascendente el dato? (L1 o L2): ");
                                                                    OpL3 = leer.nextLine();
                                                                    leer.nextLine();
                                                
                                                                    if (OpL3.equals("L1"))
                                                                    {
                                                                        L1.Insertar_Ordenado_Ascendente(d);
                                                                    }
                                                                    else if (OpL3.equals("L2"))
                                                                    {
                                                                        L2.Insertar_Ordenado_Ascendente(d);
                                                                    }
                                                                    else 
                                                                    {
                                                                        System.out.println("Opción inválida");
                                                                    }
                                                            break;
                                                            
                                                        case '2':
                                                                    System.out.println("Ingrese el dato que desea insertar en la lista: ");
                                                                    d = leer.nextInt();
                                                                    leer.nextLine();
                                                                    
                                                                    System.out.println("¿En que lista desea insertar ordenadamente descendente el dato? (L1 o L2): ");
                                                                    OpL4 = leer.nextLine();
                                                                    leer.nextLine();
                                                
                                                                    if (OpL4.equals("L1"))
                                                                    {
                                                                        L1.Insertar_Ordenado_Descendente(d);
                                                                    }
                                                                    else if (OpL4.equals("L2"))
                                                                    {
                                                                        L2.Insertar_Ordenado_Descendente(d);
                                                                    }
                                                                    else 
                                                                    {
                                                                        System.out.println("Opción inválida");
                                                                    }
                                                            break;
                                                            
                                                        case '3':
                                                                    System.out.println("Sera dirigido al MENÚ CREAR LISTA");
                                                            break;
                                                            
                                                        default:
                                                                    System.out.println("Opción equivocada");
                                                    }
                                                }
                                                while (Opc3 != '3');
                                        break;
                                        
                                    case '4':
                                                System.out.println("Sera dirigido al MENÚ LISTA DOBLEMENTE LIGADA");
                                        break;
                                        
                                    default:
                                                System.out.println("Opción equivocada");
                                }
                            }
                            while (Opc2 != '4');
                       
                    break;
                    
                case '2':
                        do
                        {
                            System.out.println("\nMENÚ ORDENAR LISTA");
                            System.out.println("1. Ascendente");
                            System.out.println("2. Descendente");
                            System.out.println("3. Salir");
                            System.out.print("R/ ");
                            Opc4 = leer.next().charAt(0);
                            leer.nextLine();
                            
                            switch (Opc4)
                            {
                                case '1':
                                            System.out.println("¿Que lista desea ordenar ascendentemente? (L1 o L2): ");
                                            OpL5 = leer.nextLine();
                                            leer.nextLine();
                                                
                                            if (OpL5.equals("L1"))
                                            {
                                                L1.Ordenar_Lista_Ascendente();
                                            }
                                            else if (OpL5.equals("L2"))
                                            {
                                                L2.Ordenar_Lista_Ascendente();
                                            }
                                            else 
                                            {
                                                System.out.println("Opción inválida");
                                            }
                                    break;
                                    
                                case '2':
                                            System.out.println("¿Que lista desea ordenar descendentemente? (L1 o L2): ");
                                            OpL6 = leer.nextLine();
                                            leer.nextLine();
                                                
                                            if (OpL6.equals("L1"))
                                            {
                                                L1.Ordenar_Lista_Descendente();
                                            }
                                            else if (OpL6.equals("L2"))
                                            {
                                                L2.Ordenar_Lista_Descendente();
                                            }
                                            else 
                                            {
                                                System.out.println("Opción inválida");
                                            }
                                    break;
                                    
                                case '3':
                                            System.out.println("Sera dirigido al MENÚ LISTA DOBLEMENTE LIGADA");
                                    break;
                                    
                                default:
                                            System.out.println("Opción equivocada");
                            }
                        }
                        while (Opc4 != '3');
                        
                    break;
                    
                case '3':
                            do 
                            {
                                System.out.println("\nMENÚ BUSCAR");
                                System.out.println("1. Mostrar posición");
                                System.out.println("2. Eliminar");
                                System.out.println("3. Reemplazar");
                                System.out.println("4. Salir");
                                System.out.print("R/ ");
                                Opc5 = leer.next().charAt(0);
                                leer.nextLine();
                            
                                switch (Opc5)
                                {
                                    case '1':
                                                System.out.println("Ingrese el dato que desea buscar en la lista: ");
                                                d = leer.nextInt();
                                                leer.nextLine();
                                                
                                                System.out.println("¿En que lista desea buscarlo? (L1 o L2): ");
                                                OpL7 = leer.nextLine();
                                                leer.nextLine();
                                                
                                                if (OpL7.equals("L1"))
                                                {
                                                    L1.Buscar_Mostrar_Posicion(d);
                                                }
                                                else if (OpL7.equals("L2"))
                                                {
                                                    L2.Buscar_Mostrar_Posicion(d);
                                                }
                                                else 
                                                {
                                                    System.out.println("Opción inválida");
                                                }
                                        break;
                                    
                                    case '2':
                                                System.out.println("Ingrese el dato que desea eliminar de la lista: ");
                                                d = leer.nextInt();
                                                leer.nextLine();
                                                
                                                System.out.println("¿De que lista desea aliminarlo? (L1 o L2): ");
                                                OpL8 = leer.nextLine();
                                                leer.nextLine();
                                                
                                                if (OpL8.equals("L1"))
                                                {
                                                    L1.Buscar_Eliminar(d);
                                                }
                                                else if (OpL8.equals("L2"))
                                                {
                                                    L2.Buscar_Eliminar(d);
                                                }
                                                else 
                                                {
                                                    System.out.println("Opción inválida");
                                                }
                                        break;
                                    
                                    case '3':
                                                System.out.println("Ingrese el dato que desea reemplazar en la lista: ");
                                                d = leer.nextInt();
                                                leer.nextLine();
                                                
                                                System.out.println("¿De que lista desea reemplazarlo? (L1 o L2): ");
                                                OpL9 = leer.nextLine();
                                                leer.nextLine();
                                                
                                                if (OpL9.equals("L1"))
                                                {
                                                    L1.Buscar_Reemplazar(d);
                                                }
                                                else if (OpL9.equals("L2"))
                                                {
                                                    L2.Buscar_Reemplazar(d);
                                                }
                                                else 
                                                {
                                                    System.out.println("Opción inválida");
                                                }
                                        break;
                                    
                                    case '4':
                                                System.out.println("Sera dirigido al MENÚ LISTA DOBLEMENTE LIGADA");
                                        break;
                                    
                                    default:
                                                System.out.println("Opción equivocada");
                                }
                            }
                            while (Opc5 != '4');
                        
                    break;
                    
                case '4':
                            do 
                            {                        
                                System.out.println("\nMENÚ MULTIPLICAR LISTAS");
                                System.out.println("1. Multiplicar listas");
                                System.out.println("2. Multiplicar y sumar listas");
                                System.out.println("3. Salir");
                                System.out.print("R/ ");
                                Opc6 = leer.next().charAt(0);
                                leer.nextLine();
                                
                                switch (Opc6)
                                {
                                    case '1':
                                                L1.Multiplicar_Listas(L2);
                                        break;
                                        
                                    case '2':
                                                System.out.println("¿Cual sera la lista principal a multiplicar? (L1 o L2): ");
                                                OpL10 = leer.nextLine();
                                                leer.nextLine();
                                                
                                                if (OpL10.equals("L1"))
                                                {
                                                    L1.Multiplicar_Y_SumarListas(L2);
                                                }
                                                else if (OpL10.equals("L2"))
                                                {
                                                    L2.Multiplicar_Y_SumarListas(L1);
                                                }
                                                else 
                                                {
                                                    System.out.println("Opción inválida");
                                                } 
                                        break;
                                        
                                    case '3':
                                                System.out.println("Sera dirigido al MENÚ LISTA DOBLEMENTE LIGADA");
                                        break;
                                        
                                    default:
                                                System.out.println("Opcion equivocada");
                                }
                            } 
                            while (Opc6 != '3');
                    break;
                    
                case '5':
                            System.out.println("¿Cual sera la lista principal a intercalar? (L1 o L2): ");
                            OpL11 = leer.nextLine();
                            leer.nextLine();
                                                
                            if (OpL11.equals("L1"))
                            {
                                L1.Intercalar_Listas(L2);
                            }
                            else if (OpL11.equals("L2"))
                            {
                                L2.Intercalar_Listas(L1);
                            }
                            else 
                            {
                                System.out.println("Opción inválida");
                            }
                    break;
                    
                case '6':
                            System.out.println("¿Cual es la lista que desea que se muestre? (L1 o L2): ");
                            OpL12 = leer.nextLine();
                            leer.nextLine();
                                                
                            if (OpL12.equals("L1"))
                            {
                                L1.Mostrar();
                            }
                            else if (OpL12.equals("L2"))
                            {
                                L2.Mostrar();
                            }
                            else 
                            {
                                System.out.println("Opción inválida");
                            }
                    break;
                    
                case '7':
                            System.out.println("A continuacion saldra del menu");
                    break;
                    
                default:
                            System.out.println("Opción equivocada");
            }  
        } 
        while (Opc != '7');
        
        System.out.println("\n¡Adiós!, fue un gusto que usara nuestro menú\n");
        
    }
    
}
