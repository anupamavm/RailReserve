INSERT INTO coaches
(
    train_id,
    coach_number,
    coach_type
)

VALUES


    (
        (SELECT id FROM trains LIMIT 1),
    1,
    'RESERVED'
    ),


(
(SELECT id FROM trains LIMIT 1),
2,
'RESERVED'
),


(
(SELECT id FROM trains LIMIT 1),
3,
'RESERVED'
),


(
(SELECT id FROM trains LIMIT 1),
4,
'UNRESERVED'
),


(
(SELECT id FROM trains LIMIT 1),
5,
'UNRESERVED'
),


(
(SELECT id FROM trains LIMIT 1),
6,
'UNRESERVED'
),


(
(SELECT id FROM trains LIMIT 1),
7,
'UNRESERVED'
),


(
(SELECT id FROM trains LIMIT 1),
8,
'UNRESERVED'
);