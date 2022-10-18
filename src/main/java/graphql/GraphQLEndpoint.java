package graphql;

import com.coxautodev.graphql.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;
import repository.StudentRepository;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    public GraphQLEndpoint() {
        super(buildSchema());
    }

    private static GraphQLSchema buildSchema() {

        StudentRepository studentRepository = new StudentRepository();

        return SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(new Query(studentRepository))
                .build()
                .makeExecutableSchema();
    }
}
