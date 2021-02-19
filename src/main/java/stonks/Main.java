package stonks;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.util.logging.FallbackLoggerConfiguration;

public class Main {
    public static void main(String[] args)
    {

        String token = "ODEyMzI1NTgwMjA4NDcyMDk0.YC_HJg.TaDZSdW3tI3xKGF10g9jN1QlBrA";
        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();
        api.addListener(new MyListener());
    }
}

