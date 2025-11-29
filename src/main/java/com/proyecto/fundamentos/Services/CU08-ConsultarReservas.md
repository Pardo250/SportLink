Actor principal: Usuario autenticado
-Descripción: El usuario revisa las reservas que ha realizado.
-Precondiciones: Haber iniciado sesión.
-Postcondiciones: El sistema muestra todas las reservas asociadas al usuario.

Flujo principal:

1. El usuario accede a “Mis reservas”.

2. El sistema consulta ReservationRepository.findByUserId().

3. El sistema muestra la lista de reservas del usuario.