
package proyecto.lista.doblemente.ligada;

import java.util.Scanner;


public class Lista {
    
    Nodo Punta, Fin;
    
    public Lista(){
        Punta = null;
        Fin = null;
    }
    
    
    
    void Insertar_Inicio(int d, boolean B){
        Nodo x;
        
        x = new Nodo (d);
        
        if (Punta != null)
        {
            Punta.setLigaI(x);
            x.setLigaD(Punta);
            Punta = x;
        }
        else
        {
            Punta = x;
            Fin = x;
        }
       
        if (B == true)
        {
            System.out.println("El dato fue insertado al inicio con éxito");
        }
    }
    
    
    void Insertar_Final(int d, boolean B){
        Nodo x;
        
        x = new Nodo(d);
        
        if (Fin != null)
        {
            Fin.setLigaD(x);
            x.setLigaI(Fin);
            Fin = x;
        }
        else
        {
            Punta = x;
            Fin = x;
        }
        
        if (B == true)
        {
            System.out.println("El nodo fue insertado al final con exito");
        }
    }
    
    
    void Insertar_Ordenado_Ascendente(int d){
        Nodo x, p, q;
        boolean B;
        
        B = false;
        x = new Nodo (d);
        
        if (Punta != null)
        {
            p = Punta;
            q = p.getLigaD();
            
            do 
            { 
                
                if ((p != null) && (q != null))
                {
                    if ((x.getDato() <= p.getDato()) && (p == Punta))
                    {
                        Insertar_Inicio(d, B);
                    
                        p = null;
                        q = null;
                    } 
                    else if ((p.getDato() <= x.getDato()) && (x.getDato() <= q.getDato()))
                    {
                        p.setLigaD(x);
                        x.setLigaI(p);
                        x.setLigaD(q);
                        q.setLigaI(x);
                    
                        p = null;
                        q = null;
                    }
                    else if ((q.getDato() <= x.getDato()) && (q == Fin))
                    {
                        Insertar_Final(d, B);
                    
                        p = null;
                        q = null;
                    }
                    else  
                    {
                        p = p.getLigaD();
                    
                        if (p != null)
                        {
                            q = p.getLigaD();
                        }
                    }
                }
                else
                {
                    if ((x.getDato() <= p.getDato()) && (p == Punta))
                    {
                        Insertar_Inicio(d, B);
                    
                        p = null;
                        q = null;
                    }
                    else if (x.getDato() <= p.getDato())
                    {
                        q = p.getLigaI();
                        
                        q.setLigaD(x);
                        x.setLigaI(q);
                        x.setLigaD(p);
                        p.setLigaI(x);
                        
                        p = null;
                        q = null;
                    }
                    else if (p.getDato() <= x.getDato())
                    {
                        Insertar_Final (d, B);
                        
                        p = null;
                        q = null;
                    }
                }  
            } 
            while ((p != null) || (q != null));
        }
        else
        {
            Punta = x;
            Fin = x;
        }
        
        System.out.println("El dato fue insertado ascendentemente ordenado con éxito");
    }
    
    
    void Insertar_Ordenado_Descendente(int d){
        Nodo x, p, q;
        boolean B;
        
        B = false;
        x = new Nodo (d);
        
        if (Punta != null)
        {
            p = Punta;
            q = p.getLigaD();
            
            do 
            {   
                if ((p != null) && (q != null))
                {
                    if ((x.getDato() >= p.getDato()) && (p == Punta))
                    {
                        Insertar_Inicio(d, B);
                    
                        p = null;
                        q = null;
                    } 
                    else if ((p.getDato() >= x.getDato()) && (x.getDato() >= q.getDato()))
                    {
                        p.setLigaD(x);
                        x.setLigaI(p);
                        x.setLigaD(q);
                        q.setLigaI(x);
                    
                        p = null;
                        q = null;
                    }
                    else if ((q.getDato() >= x.getDato()) && (q == Fin))
                    {
                        Insertar_Final(d, B);
                    
                        p = null;
                        q = null;
                    }
                    else  
                    {
                        p = p.getLigaD();
                    
                        if (p != null)
                        {
                            q = p.getLigaD();
                        }
                    }
                }
                else
                {
                    if ((x.getDato() >= p.getDato()) && (p == Punta))
                    {
                        Insertar_Inicio(d, B);
                    
                        p = null;
                        q = null;
                    }
                    else if (x.getDato() >= p.getDato())
                    {
                        q = p.getLigaI();
                        
                        q.setLigaD(x);
                        x.setLigaI(q);
                        x.setLigaD(p);
                        p.setLigaI(x);
                        
                        p = null;
                        q = null;
                    }
                    else if (p.getDato() >= x.getDato())
                    {
                        Insertar_Final (d, B);
                        
                        p = null;
                        q = null;
                    }
                }
            } 
            while ((p != null) || (q != null));
        }
        else
        {
            Punta = x;
            Fin = x;
        }
        
        System.out.println("El dato fue insertado descendentemente ordenado con éxito");
    }
    
    
    void Ordenar_Lista_Ascendente(){
        Nodo p, q;
        int Aux;
        
        if (Punta != null)
        {
            p = Punta;
            q = p.getLigaD();
            
            while (p != null)
            {
                while (q != null)
                {
                    if (p.getDato() > q.getDato())
                    {
                        Aux = q.getDato();
                        
                        q.setDato(p.getDato());
                        p.setDato(Aux);
                    }
                    
                    q = q.getLigaD();
                }
                
                p = p.getLigaD();
                
                if (p != null)
                {
                    q = p.getLigaD();
                }
            }
            
            System.out.println("La lista ha sido ordenada exitosamente");
        }
        else
        {
            System.out.println("No hay lista para ordenar ascendentemente");
        }
    }
    
    
    void Ordenar_Lista_Descendente(){
        Nodo p, q;
        int Aux;
        
        if (Punta != null)
        {
            p = Punta;
            q = p.getLigaD();
            
            while (p != null)
            {
                while (q != null)
                {
                    if (p.getDato() < q.getDato())
                    {
                        Aux = q.getDato();
                        q.setDato(p.getDato());
                        p.setDato(Aux);
                    }
                    
                    q = q.getLigaD();
                }
                
                p = p.getLigaD();
                
                if (p != null)
                {
                    q = p.getLigaD();
                }
            }
        }
        else
        {
            System.out.println("No hay lista para ordenar descendentemente");
        }
    }
    
    
    void Buscar_Mostrar_Posicion(int d){
        Nodo p;
        int Cont;
        boolean Ban;
        
        if (Punta != null)
        {
            p = Punta;
            Cont = 1;
            Ban = false;
            
            do 
            {   
                if (p.getDato() == d)
                {
                    System.out.println("Se encontro el dato solicitado en la posición: " + Cont);
                    
                    Ban = true;
                }
                
                p = p.getLigaD();
                
                Cont++;
            } 
            while (p != null);
            
            if (Ban != true)
            {
                System.out.println("No se encontró el dato solicitado en la lista");
            }
            else
            {
                System.out.println("Se encontró con éxito el dato en la lista");
            }
        }
        else
        {
            System.out.println("No hay lista en la cual buscar y mostrar la posición de algún dato");
        }
    }
    
    
    void Buscar_Eliminar(int d){
        Nodo p, q;
        boolean Ban;
        
        if (Punta != null)
        {
            p = Punta;
            Ban = false;
            
            do
            {
                if (p.getDato() == d)
                {
                    if (p == Punta)
                    {
                        if (Punta == Fin)
                        {
                          Fin = null;
                        }
                        
                        Punta = p.getLigaD();
                        
                        p.setLigaD(null);
                        
                        p.setLigaI(null);
                        
                        p = Punta;
                    }
                    else if (p == Fin)
                    {
                        Fin = p.getLigaI();
                        
                        p.setLigaI(null);
                        
                        p = null;
                        
                        Fin.setLigaD(null);
                    }
                    else
                    {
                        q = p.getLigaI();
                        
                        q.setLigaD(p.getLigaD());
                        
                        if (p != null)
                        {
                            q = p.getLigaD();
                        }
                        
                        q.setLigaI(p.getLigaI());
                        p.setLigaI(null);
                        p.setLigaD(null);
                        
                        p = q;
                    }
                    
                    Ban = true;
                }
                else
                {
                    p = p.getLigaD();
                }
            }
            while (p != null);
            
            if (Ban != true)
            {
                System.out.println("El dato no se encontro en la lista para ser eliminado");
            }
            else
            {
                System.out.println("El dato fue eliminado de la lista con éxito");
            }
        }
        else
        {
            System.out.println("No hay lista de la cual eliminar algún dato");
        }
    }
    
    
    void Buscar_Reemplazar(int d){
        Nodo p;
        int Aux;
        boolean Ban;
        Scanner leer;
        
        leer = new Scanner(System.in);
        
        if (Punta != null)
        {
            p = Punta;
            Aux = 0;
            Ban = false;
            
            do 
            {                
                if (p.getDato() == d)
                {
                    System.out.println("Se encontro el dato solicitado\n" + "Ingrese el dato por el cual desea reemplazarlo: ");
                    Aux = leer.nextInt();
                    leer.nextLine();
                    
                    p.setDato(Aux);
                    
                    Ban = true;
                }
                
                p = p.getLigaD();
            } 
            while (p != null);
            
            if (Ban != true)
            {
                System.out.println("No se encontro el dato solicitado de la lista para reemplazarlo");
            }
            else
            {
                System.out.println("Se encontro y reemplazo con éxito el dato de la lista");
            }
        }
    }
    
    
    void Mostrar(){
        Nodo p;
        String lista;
        
        if (Punta != null)
        {
            p = Punta;
            lista = "";
            
            do 
            {
                System.out.print("<-[" + p.getDato() + "]->");
                
                lista = lista + "<-[" + p.getDato() + "]->";
                p = p.getLigaD();
            }
            while (p != null);
            
            System.out.println("\n");
        }
        else
        {
            System.out.println("No hay lista la cual mostrar");
        }
    }
    
    
    void Multiplicar_Listas(Lista L){
        Nodo p, q;
        int Mul;
        Lista L3;
        String Resp;
        Scanner leer;
        boolean B;
        
        B = false;
        leer = new Scanner(System.in);
        L3 = new Lista();
        p = Punta;
        q = L.Punta;
        Mul = 0;
        
        while ((p != null) || (q != null))
        {
            if ((p != null) && (q != null))
            {
                Mul = p.getDato()*q.getDato();
                
                L3.Insertar_Final(Mul, B);
                
                p = p.getLigaD();
                q = q.getLigaD();
            }
            else if (p != null)
            {
                L3.Insertar_Final(p.getDato(), B);
                
                p = p.getLigaD();
            }
            else if (q != null)
            {
                L3.Insertar_Final(q.getDato(), B);
                
                q = q.getLigaD();
            }
        }
        
        if ((Punta == null) && (L.Punta == null))
        {
            System.out.println("No hay listas en las cuales multiplicar");
        }
        else
        {
            System.out.println("Las listas fueron multiplicadas con exito");
            
            System.out.println("¿Desea ver la lista resultante de la multiplicacion? (Si o No): ");
            Resp = leer.nextLine();
            leer.nextLine();
            
            if (Resp.equals("Si"))
            {
                L3.Mostrar();
            }
        }
    }
    
    
    void Multiplicar_Y_SumarListas(Lista L){
        Nodo p, q;
        int Sum;
        Lista L3;
        String Resp;
        Scanner leer;
        boolean B;
        
        B = false;
        leer = new Scanner(System.in);
        L3 = new Lista();
        
        if ((Punta != null) && (L.Punta != null))
        {
            p = Punta;
            q = L.Punta;
            
            while (p != null)
            {
                Sum = 0;
                
                while (q != null)
                {
                    Sum = Sum+(p.getDato()*q.getDato());
                    
                    q = q.getLigaD();
                }
                
                L3.Insertar_Final(Sum, B);
                
                p = p.getLigaD();
                q = L.Punta;
            }
            
            System.out.println("Las listas se multiplicaron y sumaron exitosamente");
            
            System.out.println("¿Desea ver la lista resultante de la multiplicacion y sumatoria? (Si o No): ");
            Resp = leer.nextLine();
            leer.nextLine();
            
            if (Resp.equals("Si"))
            {
                L3.Mostrar();
            }
        }
        else if (Punta != null)
        {
            p = Punta;
            
            while (p != null)
            {
                L3.Insertar_Final(p.getDato(), B);
                
                p = p.getLigaD();
            }
            
            System.out.println("Se multiplico y sumo exitosamente");
            
            System.out.println("¿Desea ver la lista resultante de la multiplicacion y sumatoria? (Si o No): ");
            Resp = leer.nextLine();
            leer.nextLine();
            
            if (Resp.equals("Si"))
            {
                L3.Mostrar();
            }
        }
        else if (L.Punta != null)
        {
            q = L.Punta;
           
            while (q != null)
            {
                L3.Insertar_Final(q.getDato(), B);
                
                q = q.getLigaD();
            }
            
            System.out.println("Se multiplico y sumo exitosamente");
            
            System.out.println("¿Desea ver la lista resultante de la multiplicacion y sumatoria? (Si o No): ");
            Resp = leer.nextLine();
            leer.nextLine();
            
            if (Resp.equals("Si"))
            {
                L3.Mostrar();
            }
        }
        else
        {
            System.out.println("No hay listas en las cuales multiplicar y sumar");
        }
    }
    
    
    void Intercalar_Listas(Lista L){
        Nodo p, q;
        Lista L3;
        String Resp;
        Scanner leer;
        boolean B;
        
        B = false;
        leer = new Scanner(System.in);
        L3 = new Lista();
        p = Punta;
        q = L.Punta;
        
        while ((p != null) || (q != null))
        {
            if ((p != null) && (q != null))
            {
                L3.Insertar_Final(p.getDato(), B);
                L3.Insertar_Final(q.getDato(), B);
                
                p = p.getLigaD();
                q = q.getLigaD();
            }
            else if (p != null)
            {
                L3.Insertar_Final(p.getDato(), B);
                
                p = p.getLigaD();
            }
            else if (q != null)
            {
                L3.Insertar_Final(q.getDato(), B);
                
                q = q.getLigaD();
            }
        }
        
        if ((Punta == null) && (L.Punta == null))
        {
            System.out.println("No hay listas las cuales intercalar");
        }
        else
        {
            System.out.println("Las listas fueron intercaladas con exito");
            
            System.out.println("¿Desea ver la lista resultante de la intercalacion? (Si o No): ");
            Resp = leer.nextLine();
            leer.nextLine();
            
            if (Resp.equals("Si"))
            {
                L3.Mostrar();
            }
        }
    }
    
    
    
}
