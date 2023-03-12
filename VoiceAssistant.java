import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import java.awt.*;
import java.net.URI;

public class VoiceAssistant {
    Desktop desk = Desktop.getDesktop();
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("src\\dic.dic");
        config.setLanguageModelPath("src\\lm.lm");
        try {
            Desktop desk = Desktop.getDesktop();
            LiveSpeechRecognizer rec = new LiveSpeechRecognizer(config);
            rec.startRecognition(true);
            while ( rec.getResult() != null){
                String result = rec.getResult().getHypothesis();
                if (result.toLowerCase().equals("youtube")) {
                    URI ytUri = new URI("https://www.youtube.com/");
                    System.out.println("Opening "+result+".");
                    desk.browse(ytUri);
                } else if (result.toLowerCase().equals("google")) {
                    URI uri = new URI("https://www.google.com/");
                    System.out.println("Opening "+result+".");
                    desk.browse(uri);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
