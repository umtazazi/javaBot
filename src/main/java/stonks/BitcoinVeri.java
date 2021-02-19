package stonks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class BitcoinVeri
{
    public static String getBitcoinToDolar() throws IOException
    {
        URL url = new URL("https://www.blockchain.com/explorer");
        InputStream is = url.openStream();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null)
            {
                if(line.contains("<span class=\"sc-1ryi78w-0 cILyoi sc-16b9dsl-1 ZwupP u3ufsr-0 eQTRKC sc-1mty1jv-2 dXBjzl\" opacity=\"1\">"))
                {
                    int index=line.indexOf("<span class=\"sc-1ryi78w-0 cILyoi sc-16b9dsl-1 ZwupP u3ufsr-0 eQTRKC sc-1mty1jv-2 dXBjzl\" opacity=\"1\">")
                            +"<span class=\"sc-1ryi78w-0 cILyoi sc-16b9dsl-1 ZwupP u3ufsr-0 eQTRKC sc-1mty1jv-2 dXBjzl\" opacity=\"1\">".length();
                    String bitcoin_to_dolar=line.substring(index);
                    bitcoin_to_dolar=bitcoin_to_dolar.substring(0, bitcoin_to_dolar.indexOf("<"));
                    return "1 bitcoin şu an "+bitcoin_to_dolar+" değerindedir...";
                }

            }
        }
        catch (Exception e)
        {
            return "fuck_you";
        }
        return "fuck_you";
    }

}
