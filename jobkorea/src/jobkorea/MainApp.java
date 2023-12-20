package jobkorea;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MainApp {
	public static void main(String[] args) throws IOException {
		String URL = "https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=102";
		Document doc = Jsoup.connect(URL).get();
		Elements elements = doc.getElementsByAttributeValue("class","list_body section_index");
		System.out.println(elements);
		
	}
	
}
