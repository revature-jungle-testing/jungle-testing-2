package unitTest.service;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import dev.com.thejungle.dao.implementations.ChatDAO;
import dev.com.thejungle.dao.interfaces.ChatDAOInt;
import dev.com.thejungle.entity.ChatMessage;
import dev.com.thejungle.service.interfaces.ChatServiceInt;

public class ChatServiceTest {
    
    public static ChatServiceInt chatService;
    public static ChatDAOInt chatDao;


    @BeforeClass
    public static void setup(){
        chatDao = new ChatDAO();
        chatService = new ChatService(chatDao);
    }


    // positive
    @Test
    public void serviceCreateMessageObject(){
        ChatMessage createMessage = new ChatMessage(
            10000,
            java.sql.Date.valueOf("1993-01-05"),
            10000,
            10000,
            "hello world"
        )
        ChatMessage result = chatService.createMessageService(createMessage);
        Assert.assertNotNull(result);
    }

    @Test
    public void serviceGetMessageHistory(){
        ChatMessage getMessageHistory = new ChatMessage(
            "xxx",
            "xxx"
        )
        ChatMessage result = chatService.getMessageHistoryService(getMessageHistory);
        Assert.assertNotNull(result);
    }
    

    // negative
    @Test
    public void serviceCreateMessageFailInvalidChatId(){
        
    }

    

    @Test
    public void serviceGetMessageHistoryFailedChatId(){

    }


}