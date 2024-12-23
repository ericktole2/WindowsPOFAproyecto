import com.github.tototoshi.csv._
import java.io.File

implicit object CSVFormatter extends DefaultCSVFormat {
  override val delimiter = ';'
}

val path2Movies : String = ("\"C:\\Users\\toled\\OneDrive\\Escritorio\\ProyectoIntegrador\\small_pi_movies\\small_pi_movies.csv\"")

val reader : CSVReader =
  CSVReader.open(new File(path2Movies))

val dataMap : List[Map[String,String]]
= reader.allWithHeaders()

dataMap.foreach(println)