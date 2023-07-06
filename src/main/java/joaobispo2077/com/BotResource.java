package joaobispo2077.com;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

@Path("/bots")
public class BotResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bot> findAll() {
        return Bot.listAll();
    }

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public Bot create(Bot bot) {
        bot.persist();
        return bot;
    }

}