Actor principal: Usuario
-Descripción: El usuario crea una cuenta en el sistema para poder realizar reservas.
-Precondiciones: El usuario no debe tener un correo registrado previamente.
-Postcondiciones: El usuario queda registrado y puede iniciar sesión.

Flujo principal:

1. El usuario ingresa a la pantalla de registro.

2. El usuario introduce: nombre, correo, contraseña y teléfono.

3. El sistema valida si el correo ya existe.

4. Si no existe, crea el usuario.

5. El sistema redirige a la pantalla de login.

Flujo alternativo:

A1: Si el correo ya existe, el sistema muestra “Email ya registrado”.
