package ru.pixoris;

import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class GraphQLDataFetchers {

    private static List<Map<String, String>> users = Arrays.asList(
        new User("0", "Sasha", "223").genUser(),
        new User("1", "Harry", "223").genUser(),
        new User("2", "Tomas", "223").genUser()
    );

    public DataFetcher getUser() {
        return dataFetchingEnvironment -> {
            String userId = dataFetchingEnvironment.getArgument("id");
            return users
                    .stream()
                    .filter(user -> user.get("id").equals(userId))
                    .findFirst()
                    .orElse(null);
        };
    }
}
