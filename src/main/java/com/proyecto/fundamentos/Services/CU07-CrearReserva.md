Actor principal: Usuario autenticado
-Descripción: El usuario realiza la reserva de un espacio deportivo.
-Precondiciones:

-Debe estar autenticado.

-Debe haber seleccionado: zona, deporte, horario y método de pago.

-Postcondiciones: La reserva queda registrada con estado CONFIRMED.

Flujo principal:

1. El usuario llena el formulario de reserva.

2. El sistema asocia automáticamente:

User

Zone

Sport

Schedule

PaymentMethod

3. El usuario envía el formulario.

4. El sistema guarda la reserva con estado CONFIRMED.

5. El usuario es redirigido a su lista de reservas.
