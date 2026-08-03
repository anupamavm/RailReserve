INSERT INTO trains
(
    route_id,
    name
)

VALUES

    (
        (SELECT id FROM routes LIMIT 1),
    'Udarata Menike'
    );