
# Library 📕

El proyecto es una API para poder manejar una biblioteca

## Teconologías 
- Spring boot 
- Java 
- Swagger 



## Autor

- [@BlumerDev](https://www.github.com/BlumerDev)


## API Referencias

#### Post para agregar un cliente nuevo 

```http
  POST /client/addNewClient
```

| Parámetro | Type     | Descripción                |
| :-------- | :------- | :------------------------- |
| `clienteDTO` | `DTO` | **Se recibe un clienteDto y se lo persiste en db |

#### Get item

```http
  GET /client/list
```

| Parámetro | Type     | Descripción                     |
| :-------- | :------- | :-------------------------------- |
|       |  | **Devuelve la lista de todos los clientes|



