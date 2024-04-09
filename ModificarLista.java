
public class ModificarLista{
	///
	
	    //variables de instancia
	    //lista general donde se encuentran todas las listas
		int[][] listasGeneral;
		//que lista modificaremos
		int[] lista;
		//que elemento
		int elemento = 3;
		//posicion de la lista
		int elementoLugar=3;
		//nuevo nombre de la lista
		String elementoNombre="lista 1";
		
		
		//metodo mostrar listas
		void mostrarListas(){
		System.out.println("--------Que lista modificaremos?-------");
		
		//mostrar listas guardadas listasGeneral
		
		for(int i=0; listasGeneral.length > i; i++){
			System.out.println("Lista "+(i+1));
		}
		
		//scaner....
		//lo que escaneo igualar con for para encontrar la lista
		
		//mostrar la lista
		for(int i=0; listasGeneral.length > i; i++){
					if(elementoLugar==listasGeneral[i]){
						
					}
		
		//preguntar cambiar lugar, actualizar nombre de elemento, borrar elemento, agregar elemento
		//dependiendo lo que quiera se llama al metodo
		
		}
		
		//metodo cambiar lugar
		int[] cambiarLugar(){
			// preguntamos que lugar de la lista
			
			//scaner
			
			//igualamos con for para encontrar elemento de la lista
			
			//igualacion y el que quitamos nuevo lugar
			
			//mostramos lista actualizada
			//vas a modificar otro elemento o que pedo//regresar a menu general
				
				}
			
		}
	//////////////////////////////////////////////////////////////////////////////////////////////
		//agregarFruta(frutero,miFruta);
		String[] nuevaLista=agregarFruta(frutero,miFruta);
		cambiarOrden(nuevaLista);
		String[] listaAct=eliminarFruta(frutaEliminar,nuevaLista);
		
	static String [] agregarFruta( String [] newFrutero, String newFruta ){
		
		System.out.println("--------Lista Agregando Una Fruta-------");
			
		String [] nuevoFrutero = new String[newFrutero.length+1];
			
		for(int i=0; nuevoFrutero.length > i; i++){
			if(newFrutero.length > i){
				   
			   nuevoFrutero[i]=newFrutero[i];
				   
			   }else {
				nuevoFrutero[i]=newFruta;
				}
			System.out.println("Fruta " + (i+1) + ": " + nuevoFrutero[i]);
				 
			}
			return nuevoFrutero; 
	}
	
	static String [] cambiarOrden (String [] nuevoFrutero){
		//System.out.println(nuevoFrutero[6]);
		System.out.println("--------Cambiar Orden-------");
		int [] A=new int [nuevoFrutero.length];
		int n, i=0;
		
	//	Random r=new Random();

		while (i < nuevoFrutero.length){
			
			n = (int) (Math.random() * nuevoFrutero.length);
			
			if(! busqueda(A,n,i)){
				A[i]=n;
				//System.out.println("--------Cambiar Orden-------"+n);
				i++;
			}
		}
		
		for (int j=0;j<nuevoFrutero.length;j++){
			
			System.out.println("Fruta " + (j+1) + " " + nuevoFrutero[(A[j])]);
		}
		return nuevoFrutero;
	
	}
	
	static boolean busqueda(int [] A, int n, int i){
		
		int j;
		
		for(j=0; j<i; j++){
			
			if(n==A[j]){
				return true;
			}
		}
		return false;
	}
	
	static String [] eliminarFruta(String frutaEliminar, String [] nuevaLista){
		String [] listaAct = new String [nuevaLista.length-1];
		
		System.out.println("--------Actualizar Lista Quitando " + frutaEliminar+ "-------");
		
		for(int i=0; i<nuevaLista.length; i++){
			
			if(frutaEliminar==nuevaLista[i]){
				
				int j, h=0;
				for(j=0; j<nuevaLista.length; j++){
					
					if(j!=i){
						listaAct[h]=nuevaLista[j];
						
						//System.out.println("Fruta " + (1+h) + " " +listaAct[h]); 
						h++;
					}
					
				}
			
			}
		}
		
		for (int j=0;j<listaAct.length;j++){
			
			System.out.println("Fruta " + (j+1) + " " + listaAct[j]);
		}
		
		return listaAct ;
	}
		
}
