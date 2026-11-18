# 🏠 Proyecto X

A console application in Java for managing household chores (*tareas domésticas*): register the people living in a home and the tasks to share between them. **Work in progress.**

## 📁 Project Structure

```
Proyecto X/
├── src/proyecto/x/
│   ├── ProyectoX.java   → main(): asks for users and tasks through the console
│   ├── Usuario.java     → A member of the household (name)
│   └── Tarea.java       → A household chore
├── nbproject/           → NetBeans project config
└── build.xml            → Ant build file
```

## 🚀 How It Works

1. The program asks how many people live in the home
2. It reads each name and creates a `Usuario`, storing them in an `ArrayList<Usuario>`
3. It prints the list of users
4. It then reads the tasks into an `ArrayList<Tarea>` and prints them

```java
ArrayList<Usuario> ListaUsuarios = new ArrayList<>();
for (int i = 0; i < respuesta; i++) {
    String respuestanombre = sc.nextLine();
    ListaUsuarios.add(new Usuario("Usuario" + i + ":" + respuestanombre));
}
```

### Current status

- `Usuario` is complete (constructor + getter)
- `Tarea` still needs its constructor with a name and `getNombreTarea()`
- The number of tasks (`respuestaTareas`) is not read yet, so the project does not compile in its current state
- Next step: assign tasks to users

## 🧠 Key Concepts

- **Classes and objects** — `Usuario` and `Tarea` as domain models
- **`ArrayList<T>`** — dynamic lists of objects
- **`Scanner`** — reading console input (and the `nextInt()` + `nextLine()` gotcha)
- **Enhanced `for` loop** — iterating over collections

## 🛠️ How To Run

Open the `Proyecto X` folder in **NetBeans** and run the project, or with Ant:

```bash
cd "Proyecto X"
ant run
```
