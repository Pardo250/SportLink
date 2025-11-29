Actor principal: Usuario
-Descripción: El usuario accede al sistema para usar las funcionalidades.
-Precondiciones: El usuario debe estar registrado.
-Postcondiciones: El sistema inicia sesión y almacena al usuario en sesión.

Flujo principal:

1. El usuario abre la pantalla de login.

2. Ingresa correo y contraseña.

3. El sistema valida credenciales.

4. El usuario es autenticado y redirigido al dashboard.

Flujo alternativo:

A1: Si las credenciales no coinciden, se muestra “Credenciales inválidas”.
