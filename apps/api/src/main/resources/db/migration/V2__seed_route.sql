INSERT INTO routes
(
    name
)
VALUES
    (
        'Colombo Fort - Badulla'
    );



INSERT INTO stations
(
    route_id,
    name,
    station_order,
    distance_km
)

VALUES


    (
        (SELECT id FROM routes LIMIT 1),
    'Colombo Fort',
    1,
    0
    ),


(
(SELECT id FROM routes LIMIT 1),
'Ragama',
2,
10
),


(
(SELECT id FROM routes LIMIT 1),
'Polgahawela',
3,
74
),


(
(SELECT id FROM routes LIMIT 1),
'Peradeniya',
4,
112
),


(
(SELECT id FROM routes LIMIT 1),
'Kandy',
5,
120
),


(
(SELECT id FROM routes LIMIT 1),
'Hatton',
6,
173
),


(
(SELECT id FROM routes LIMIT 1),
'Nanu Oya',
7,
224
),


(
(SELECT id FROM routes LIMIT 1),
'Ella',
8,
271
),


(
(SELECT id FROM routes LIMIT 1),
'Badulla',
9,
292
);