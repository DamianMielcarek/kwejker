package pl.akademiakodu;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.akademiakodu.data.GifRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GifRepositoryTest {

    @Test
    public void getAllGifs() throws Exception {
        Assert.assertEquals(6,GifRepository.getAllGifs().size());
    }
}
