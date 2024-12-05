import java.util.Scanner;

public class Cane 
{
    
    //Definizione delle variabili globali
    private String nome;
	private String razza;
	private double peso;
	private double altezza;
	private String tipologia;
    
	//Definizione dei metodi
	
	public static void Salta()
	{
		System.out.println("Il cane ha saltato");
	}
	
	public static void GiraDx()
	{
		System.out.println("Il cane ha svoltato a destra");
	}
	
	public static void GiraSx()
	{
		System.out.println("Il cane ha svoltato a sinistra");
	}
	
	public static void Abbaia()
    {
		System.out.println("Il cane ha abbaiato");
    }
	
	public static void Morde()
	{
		System.out.println("Il cane ha morso");
	}
	
	public static void Corre()
	{
		System.out.println("Il cane sta correndo");
	}
	
	public static void Cammina()
	{
		System.out.println("Il cane sta camminando");
	}
	
	
	//Definizione dei Set
	
	public void SetNome(String nome)
	{
		this.nome = nome;
	}
	
	public void SetRazza(String razza)
	{
		this.razza = razza;
	}
	
	public void SetPeso(double peso)
	{
		this.peso = peso;
	}
	
	public void SetAltezza(double altezza)
	{
		this.altezza = altezza;
	}
	
	public void SetTipo(String tipo)
	{
		this.tipo = tipo;
	}
	
    public static void main(String[] args)
    {
        //Codice del main
		SetNome("Fuffy");
		SetRazza("Pitbull");
		SetPeso(27);
		SetAltezza(54);
		SetTipo("Compagnia");
		
		System.out.println("Il nome del cane è: " + nome + "\nLa razza del cane è: " + razza + "\nIl peso del cane è: " + peso + "kg" + "\nL'altezza del cane è: " + altezza + "cm" + "\nLa tipologia del cane è: " + tipo);
						   
		System.out.println("Grazie di aver usato il programma");
    }
}
