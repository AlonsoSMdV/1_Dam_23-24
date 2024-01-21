package FileSystem;

/** clase Folder
 * Hereda de la clase File e implementa la interfaz FolderEntry
 * La clase Folder mantiene una lista de archivos/carpetas así como una referencia
 * a la carpeta que la contiene
 * La clase Folder al heredar de la clase File hereda sus propiedades
 * name, level y createdAt
 * Además dispondrá de un array donde se irán añadiendo los archivos que están dentro de
 * la carpeta
 * Debe implementar la interfaz FolderEntry
 * Debe tener un constructor que recibirá la carpeta que la contiene, en el caso
 * de que sea la carpeta raiz, recibirá null en la referencia a la carpeta padre
 * Además el constructor recibirá el nombre de la carpeta así como el nivel en el que se
 * encuentra la carpeta (Nivel 0 es la carpeta raiz, Nivel 1 las carpetas hijas de la carpeta raiz,
 * y así sucesivamente)
 * Ejemplo de llamada al constructor:
 * Folder root = new Folder(null, "Raiz", 0);
 * 
 */
public class Folder extends File implements FolderEntry{
  private String folderName;
  private File[] ArrayFile = new File[100];
  private int numDeArchivosDentro;

  public Folder(String fileName,String folderName, int nivel) {
    super(fileName, nivel);
    this.folderName = folderName;
    numDeArchivosDentro = 0;
  }
  public boolean isDirectory(){
    return true;
  }
  
  public String getName() {
    return folderName;
  }
  @Override
  public Folder getParent() {
    if (this.nivel == 0) {
      return null;
    }else{
      return null;
    }
  }

  @Override
  public boolean isFolderFull() {
    if (numDeArchivosDentro == 100) {
      return true;
    }
    return false;
  }

  @Override
  public int getFileCount() {
    return this.numDeArchivosDentro;
  }

  @Override
  public boolean isFileInFolder(String fileName) {
    for (int i = 0; i < numDeArchivosDentro; i++) {
      if (ArrayFile[i].getName().equals(fileName)) {
        return true;
      }
    }
    return false;
  }

  public int positionFolder(String fileName) {

    for(int i = 0 ; i < numDeArchivosDentro ; i++){
        if(ArrayFile[i].getName().equals(fileName)){
            return i;
        }
    }

    //aqui nunca deberia de llegar nunca porque ya se ha hecho la comprobacion el la funcion que lo ha llamado
    return -1;
  }
  @Override
  public Folder addFolder(String folderName) throws FolderIsFullException, FileAlreadyExistsException {
    if (this.isFileInFolder(folderName)) {
      throw new FileAlreadyExistsException();
    }

    if (this.isFolderFull()) {
      throw new FolderIsFullException();
    }

    this.ArrayFile[numDeArchivosDentro] = new Folder(this.folderName, folderName, nivel+1);
    this.numDeArchivosDentro++;
    return (Folder) ArrayFile[numDeArchivosDentro-1];
  }

  public File addFile(String fileName) throws FolderIsFullException, FileAlreadyExistsException {
    if (this.isFileInFolder(folderName)) {
      throw new FileAlreadyExistsException();
    }

    if (this.isFolderFull()) {
      throw new FolderIsFullException();
    }

    this.ArrayFile[numDeArchivosDentro] = new File(fileName, nivel+1);
    this.numDeArchivosDentro++;
    return (File) ArrayFile[numDeArchivosDentro-1];
  }

  public File removeFile(String fileName) throws FileDoesNotExistsException {
    if (!this.isFileInFolder(fileName)) {
      throw new FileDoesNotExistsException();
    }

    for (int i = 0; i < numDeArchivosDentro; i++) {
      if (ArrayFile[i].getName().equals(fileName)) {
        ArrayFile[i] = null;
        return ArrayFile[i];
      }
    }
    return null;
  }


  public File removeFolder(String folderName, boolean recursive)
      throws FileDoesNotExistsException, FolderIsNotEmptyException {
        if (!this.isFileInFolder(folderName)) {
          throw new FileDoesNotExistsException();
        }
        
        if (this.getFileCount()>0) {
          throw new FolderIsNotEmptyException();
        }
        for (int i = 0; i < numDeArchivosDentro; i++) {
          if (ArrayFile[i].getName().equals(folderName)) {
            ArrayFile[i] = null;
            return ArrayFile[i];
          }
        }
        return null;
  }


  @Override
  public Folder getFolder(String folderName) throws FileDoesNotExistsException {
    if (!isFileInFolder(folderName)) {
      throw new FileDoesNotExistsException();
    }else{
      int posicion = this.positionFolder(folderName);
      return (Folder) this.ArrayFile[posicion];
    }
  }

  @Override
  public String toString(){
      String texto = "";
      
      for(int i = 1 ; i <= this.nivel ; i++){
          texto += " ";
      }

      texto = "|_[" + this.folderName + "]\n";

      for(int j = 0 ; j < this.getFileCount() ; j++){
        
          for(int i = 1 ; i <= this.nivel ; i++){
              texto += " ";
          }

          texto += "|_[" + this.ArrayFile[j] + "]\n";

      }

      return texto;
  }
}