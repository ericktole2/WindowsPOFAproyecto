import com.github.tototoshi.csv._
import java.io.File

implicit object CSVFormatter extends DefaultCSVFormat {
  override val delimiter = ';'
}

//small
 val path2Movies : String = "C:\\Users\\toled\\OneDrive\\Escritorio\\ProyectoIntegrador\\small_pi_movies\\small_pi_movies.csv"
// completa
//val path2Movies : String = "C:\\Users\\toled\\OneDrive\\Escritorio\\ProyectoIntegrador\\pi_movies_complete\\pi_movies_complete.csv"

val reader : CSVReader =
  CSVReader.open(new File(path2Movies))

val dataMap : List[Map[String,String]]
= reader.allWithHeaders()

dataMap.foreach(println)