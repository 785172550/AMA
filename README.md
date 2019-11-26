# AMA
# ask me anything in Issues.

## I am a student of the SiChuan university and an intern in ShangHai now.
## I like to talk with others.Fate makes us meet here,isn't it?

------ sean785172550@gmail.com

```

package org.apache.geode_examples.indexes;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.apache.geode.cache.client.ClientRegionFactory;
import org.apache.geode.cache.client.ClientRegionShortcut;
import org.apache.geode.cache.query.*;
import org.apache.geode.pdx.ReflectionBasedAutoSerializer;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Data
public class Book implements Serializable {
    String name;
    Map<String, List<FlightCode>> fmap;

    public static void main(String[] args) throws NameResolutionException, TypeMismatchException, QueryInvocationTargetException, FunctionDomainException {
        Book book = new Book();
        book.setName("hah");
        LinkedList<FlightCode> flights = new LinkedList<>();
        RegionPopulator.populateFlights(50, flights);
        Map<String, List<FlightCode>> tt = new HashMap<>();
        tt.put("key1", flights);
        book.setFmap(tt);

        // connect to the locator using default port 10334
        ClientCache cache = new ClientCacheFactory().addPoolLocator("127.0.0.1", 10334)
//                .setPdxSerializer(new ReflectionBasedAutoSerializer(
//                        "org.apache.geode_examples.Passenger",
//                        "org.apache.geode_examples.indexes.Book"))
                .set("log-level", "WARN").create();

        // create a local region that matches the server region
        ClientRegionFactory<String, Book> clientRegionFactory =
                cache.createClientRegionFactory(ClientRegionShortcut.PROXY);
//        Region<String, Book> region = clientRegionFactory.create("Book");
//        region.put(book.name, book);

        SelectResults res = (SelectResults) cache.getQueryService()
                .newQuery("select * from /Book b where ELEMENT(select v from /Book a, a.fmap['key1'] v).airlineCode = 'SKW'")
//                .newQuery("select * from /Book b where b.fmap['key1'][0].airlineCode = 'SKW' ")
                .execute();

        System.out.println(res.toString());

        // ELEMENT(select DISTINCT b.fmap['key1'] from /Book b).airlineCode = 'ASQ'
        // select DISTINCT * from /Book b
        // select DISTINCT b.fmap['key1'] from /Book b
        //select * from /Book where ELEMENT(select DISTINCT b.fmap['key1'] from /Book b).airlineCode = 'ASQ'
        // select * from /Book b where ELEMENT(b.fmap['key1']).airlineCode = 'SKW'
        // select * from /Book b where b.fmap['key1'][0].airlineCode = 'SKW'
    }


}
```
