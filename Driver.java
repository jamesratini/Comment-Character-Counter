import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFrame;
import java.io.*;

public class Driver
{
    public static void main(String[] args)
    {
        JFrame jframe = new JFrame();
        jframe.setVisible(true);
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Java Files", "java");
        int returnVal = chooser.showOpenDialog(jframe);

        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            File fileToRead = chooser.getSelectedFile();
            CharCounter c = new CharCounter();

            try
            {
                 InputStream in = new FileInputStream(fileToRead);
                Reader reader = new InputStreamReader(in);

                Reader buffer = new BufferedReader(reader);

                int r = 0;
                while((r = reader.read()) != -1)
                {
                    char ch = (char)r;
                    if(ch == '/')
                    {
                        c.Slash();
                    }
                    else if(ch == '*')
                    {
                        c.Star();
                    }
                    else if(ch == '"' || ch == '\'')
                    {
                        c.Quote();
                    }
                    else if(ch == '\n' || ch == '\r')
                    {
                        c.NewLine();
                    }
                    else
                    {
                        c.Char();
                    }
                }

                c.printCounts();
            }
            catch(Exception x)
            {
                System.out.println(x);
            }
           
        }
    }
}