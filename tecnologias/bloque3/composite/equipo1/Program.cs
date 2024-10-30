Grupo grupo1 = new Grupo("LIS-501");

Alumno alumno1 = new Alumno("Alexis", "S22017012");
Alumno alumno2 = new Alumno("Ricardo", "S22017018");
Alumno alumno3 = new("Cbas", "S22017007");

Materia materia1 = new Materia("Redes");
Materia materia2 = new Materia("Bases de datos");
Materia materia3 = new Materia("Intro a la programacion");
Materia materia4 = new Materia("Mates discretas");

grupo1.agregarAlumno(alumno1);
grupo1.agregarAlumno(alumno2);
grupo1.agregarAlumno(alumno3);

alumno1.agregarMateria(materia1, 5);
alumno1.agregarMateria(materia2,6);
alumno1.agregarMateria(materia3,8);
alumno1.agregarMateria(materia4,10);

alumno2.agregarMateria(materia1, 5);
alumno2.agregarMateria(materia2,6);
alumno2.agregarMateria(materia3,8);
alumno2.agregarMateria(materia4,10);

alumno3.agregarMateria(materia1, 10);
alumno3.agregarMateria(materia2,10);
alumno3.agregarMateria(materia3,10);
alumno3.agregarMateria(materia4,10);

Console.WriteLine(grupo1.getPromedio());