# java-base-crud

This is an initial code base for creating crud applications using Spring Reactor, Postgres, JDBC, and Lombock. Currently, there's only one endpoint implemented to return a quote by ID, and price quotation based on <a href="https://projects.tmforum.org/wiki/download/attachments/90514851/TMF648_Quote_Management_API_REST_Specification_R17.5.0.pdf?api=v2 is the main domain of this project">TMF648</a> under the <a href="https://www.tmforum.org/resources/specification/tmf648-quote-api-rest-specification-r16-0-1/">TMForum</a> is the business domain for this example.

Requirements:
* Postgres instance:
<code> run --name postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_USER=postgres -d -p 5432:5432 postgres </code>

Proposed exercices:
1. Create a GET endpoint to return all quotes
2. Create a POST endpoint to save a new quote
3. Create a PUT endpoint to modify an existing quote
4. Create a DELETE endpoint to delete an existing quote 
