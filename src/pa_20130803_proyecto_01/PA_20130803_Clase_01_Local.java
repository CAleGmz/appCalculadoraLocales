/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_20130803_proyecto_01;

/**
 *
 * @author cgl05
 */
    class Local {
        private String nombre;
        private double frente;
        private double fondo;
        private double area;
        private double perimetro;
    
        public Local()
        {
            nombre = "no-id";
            frente = 0;
            fondo = 0;
            area = 0;
            perimetro = 0;
        }
        
        public Local(String nom,double fre, double fon, double are, double per)
        {
          nombre = nom;
            frente = fre;
            fondo = fon;
            area = are;
            perimetro = per;  
        }
        
        public String getNombre()
        {
            return nombre;
        }
        
        public double getFrente()
        {
            return frente;
        }
        
        public double getFondo()
        {
            return fondo;
        }
        
        public double getArea()
        {
            return area;
        }
        
        public double getPerimetro()
        {
            return perimetro;
        }
        
        public void setNombre(String nom)
        {
            nombre = nom;
        }
        
        public void setFrente(double fre)
        {
            frente = fre;
        }
        
        public void setFondo(double fon)
        {
            fondo = fon;
        }
        
        public void setArea(double are)
        {
            area = are;
        }
        
        public void setPerimetro(double per)
        {
            perimetro = per;
        }
        
        public double frente()
        {
            return (perimetro - (2*fondo))/2;
        }
       
        
        public double area()
        {
            return frente * fondo;
        }
        

 
}
