# Proyecto X — Base para el Estado del Arte y Estudio de Mercado

> **Qué es este documento:** notas de investigación y un guion para que redactes
> tú el estado del arte. Los datos tienen su fuente al lado; **compruébalos antes
> de entregar** (los precios de las apps cambian a menudo). Los apartados marcados
> con ✍️ son los que tienes que escribir tú con tus propias palabras.

---

## 1. Qué diferencia hay entre "estado del arte" y "estudio de mercado"

| | Estado del arte | Estudio de mercado |
|---|---|---|
| Pregunta que responde | ¿Qué se sabe y qué se ha hecho ya sobre este problema? | ¿Quién compite conmigo, quién sería mi usuario y cómo ganan dinero? |
| Mira hacia | Teoría, tecnología, soluciones existentes | Competidores, público objetivo, precios, modelo de negocio |
| Resultado | Justifica **por qué** tu enfoque tiene sentido | Justifica **que hay hueco** para tu app |

Los dos acaban en lo mismo: **un hueco** (algo que nadie hace bien) que tu app va a cubrir.

---

## 2. Estado del arte

### 2.1 El problema: el reparto de las tareas del hogar

- En España las mujeres dedican de media **unas 2 h 15 min más al día** que los hombres
  a tareas del hogar y la familia (INE, *Encuesta de Empleo del Tiempo 2009-2010*).
  La brecha era de unas 3 h en 2002-2003. → Fuente: https://www.ine.es/prensa/np669.pdf
  - ⚠️ Es la última EET nacional publicada que he encontrado; revisa en ine.es si hay una más reciente.
- Cada vez más gente vive **en pisos compartidos** (sobre todo jóvenes por el precio del alquiler)
  o **sola**. El INE proyecta que los hogares unipersonales pasarán a ser el 33,5 % del total en 2039.
  → https://www.ine.es/dyngs/Prensa/PROH20242039.htm
  → https://theobjective.com/economia/2025-08-10/jovenes-comparte-piso-espana/

✍️ *Escribe 1 párrafo explicando por qué esto es un problema real y a quién afecta.*

### 2.2 La base teórica: gamificación

- **Definición de referencia:** "el uso de elementos de diseño de juegos en contextos no lúdicos"
  (Deterding, Dixon, Khaled y Nacke, 2011). → https://dl.acm.org/doi/10.1145/2181037.2181040
- **Elementos típicos** (a menudo llamados PBL): **P**untos, **B**adges (insignias/logros),
  **L**eaderboards (clasificaciones). Otros: niveles, rachas (*streaks*), misiones, avatares, recompensas.
- **Motivación intrínseca vs. extrínseca** (Teoría de la Autodeterminación, Deci y Ryan):
  la gente se motiva de verdad cuando siente **autonomía, competencia y relación con otros**.
  Los puntos por sí solos (motivación extrínseca) funcionan al principio pero se desgastan.
- **Riesgo conocido:** castigar (quitar vida, perder rachas) puede generar abandono o ansiedad;
  un ranking puede crear conflicto en casa si alguien siempre queda último.

✍️ *Explica qué elementos de gamificación usará tu app y por qué (conecta con la teoría).*

### 2.3 Tecnologías habituales en este tipo de apps

Para el módulo de DAM viene bien comentar con qué se suelen construir:

- **Apps nativas:** Android (Java/Kotlin), iOS (Swift).
- **Multiplataforma:** Flutter, React Native, Kotlin Multiplatform, .NET MAUI.
- **Backend / sincronización entre miembros del hogar:** Firebase, Supabase, API REST propia + base de datos (MySQL/PostgreSQL).
- **Notificaciones push:** Firebase Cloud Messaging.

✍️ *Di qué tecnología vas a usar tú (ahora mismo el proyecto es Java de consola) y por qué.*

---

## 3. Estudio de mercado

### 3.1 Competidores

| App | Enfoque | Gamificación | Colaborativa (varios miembros) | Precio (aprox., verificar) | Nota |
|---|---|---|---|---|---|
| **Habitica** | Hábitos y tareas en general, estilo RPG | ✅✅ Muy fuerte: avatar, nivel, oro, pierdes vida si fallas | Grupos ("parties") | Gratis + suscripción opcional | No está pensada para el hogar; penaliza fallos |
| **Sweepy** | Limpieza del hogar | ✅ Puntos y clasificación del hogar | ✅ | Premium ~3,99 $/mes o ~19,99 $/año | Asigna tareas automáticamente |
| **Tody** | Limpieza según "lo sucio que está" (sistema de colores) | Poca (algo de "Dusty", un personaje) | Solo en Premium+ | Premium ~9,99 $/año; Premium+ 25–80 $/año según miembros | Muy visual |
| **Flatastic** | Pisos compartidos (WG en Alemania) | ✅ Puntos por tarea | ✅ | Gratis con anuncios + Premium | Incluye lista de la compra y gastos comunes |
| **OurHome** | Familias con niños, recompensas | ✅ Puntos canjeables | ✅ | Era gratis | **Abandonada**: sin actualizar desde 2020, retirada de Google Play en 2023 |
| **Cozi** | Organizador familiar (calendario, listas) | ❌ | ✅ | Gratis + Gold | Muy usada en EE. UU.; no es de tareas gamificadas |

Fuentes:
- https://tidywell-app.com/blog/gamified-chore-apps-adhd-adults
- https://getsense.ai/blog/posts/best-ourhome-alternatives-2025
- https://gethomsy.com/blog/chores-and-household/best-chore-app-for-couples
- https://www.flatastic-app.com/en/premium/
- https://apps.apple.com/us/app/habitica-gamified-taskmanager/id994882113

⚠️ Muchas de estas fuentes son **blogs de otras apps competidoras**: son útiles para descubrir apps,
pero los precios compruébalos en la App Store / Google Play o en la web oficial.

✍️ *Instala 2 o 3 de ellas y pruébalas. Anota qué te gusta y qué no: eso vale mucho más que cualquier tabla copiada.*

### 3.2 Tamaño del mercado

- Hay estimaciones de blogs que hablan de ~500 M$ para apps de limpieza/tareas en 2025,
  pero **no tienen una fuente seria detrás**. Mejor no usarlas como dato fuerte.
- Dato más útil y verificable: **el número de hogares** en España (INE) y el porcentaje de
  jóvenes que comparten piso → eso es tu mercado potencial.

### 3.3 Público objetivo

✍️ *Elige UNO principal (no "todo el mundo"):*
- Pisos de estudiantes / compañeros de piso
- Parejas jóvenes
- Familias con hijos

### 3.4 Modelo de negocio habitual en el sector

- **Freemium** (lo más común): gratis con funciones básicas + suscripción.
- Suscripción **por hogar** (Tody Premium+, Flatastic) en vez de por persona.
- Anuncios en la versión gratis.

---

## 4. Análisis del hueco (DAFO / conclusión)

Huecos que se ven en el mercado:
1. Las apps muy gamificadas (Habitica) **no están pensadas para el hogar** y castigan.
2. Las apps de hogar (Tody, Cozi) tienen **poca gamificación**.
3. OurHome, que mezclaba las dos cosas, **está abandonada**.
4. La mayoría están **en inglés** o pensadas para otros mercados.
5. Pocas miden el **reparto justo** entre convivientes (relación con la brecha del apartado 2.1).

✍️ *Escribe tu DAFO (Debilidades, Amenazas, Fortalezas, Oportunidades) y la conclusión:
"Proyecto X se diferencia porque…"*
