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

#### Get client list

**Devuelve la lista de todos los clientes**

```http
  GET /client/list
```

## Author endpoints

```http
  POST /author/addNewAuthor
```

| Parámetro | Type     | Descripción                                     |
| :-------- | :------- |:------------------------------------------------|
| `AuthorDTO` | `DTO` | **Se recibe un authorDto y se lo persiste en db |

#### Post para hacer un update de author

```http
  POST /author/updateAuthor/{id}
```

| Parámetro | Type     | Descripción                                             |
| :-------- | :------- |:--------------------------------------------------------|
| `AuthorDTO` | `DTO` | **Se recibe un authorDto y id. Se modicia dicho autor   |

Clonar el repositorio

```bash
  git clone https://github.com/blumerDev/Library/tree/dev
```

Ir al directorio del repositorio

```bash
  cd Library
```

Abrir el IDE, compilar y correr con maven

## Enpoint con swagger

```bash
 http://localhost:8080/swagger-ui/index.html



