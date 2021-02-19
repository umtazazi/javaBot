package stonks;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.event.message.MessageEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import java.io.IOException;


public class MyListener implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent e){

            if(e.getMessageContent().equalsIgnoreCase("!bitcoin"))
            {
                BitcoinVeri bitcoinToDolar=new BitcoinVeri();
                try {
                    e.getChannel().sendMessage(bitcoinToDolar.getBitcoinToDolar());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
}