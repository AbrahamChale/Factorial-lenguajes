WITH RECURSIVE factorial(n, resultado) AS (
    SELECT 1, 1
    UNION ALL
    SELECT n+1, resultado * (n+1) FROM factorial WHERE n < 5
)
SELECT resultado FROM factorial WHERE n = 5;