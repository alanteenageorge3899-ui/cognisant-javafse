SET SERVEROUTPUT ON;

DECLARE
    marks NUMBER := 82;
    i NUMBER := 1;
BEGIN
    -- IF-THEN-ELSE
    IF marks >= 90 THEN
        DBMS_OUTPUT.PUT_LINE('Grade A');
    ELSIF marks >= 75 THEN
        DBMS_OUTPUT.PUT_LINE('Grade B');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Grade C');
    END IF;

    -- CASE Statement
    CASE
        WHEN marks >= 90 THEN
            DBMS_OUTPUT.PUT_LINE('Excellent');
        WHEN marks >= 75 THEN
            DBMS_OUTPUT.PUT_LINE('Very Good');
        ELSE
            DBMS_OUTPUT.PUT_LINE('Needs Improvement');
    END CASE;

    -- FOR Loop
    DBMS_OUTPUT.PUT_LINE('FOR LOOP');
    FOR j IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE(j);
    END LOOP;

    -- WHILE Loop
    DBMS_OUTPUT.PUT_LINE('WHILE LOOP');
    WHILE i <= 5 LOOP
        DBMS_OUTPUT.PUT_LINE(i);
        i := i + 1;
    END LOOP;

    -- Simple LOOP
    DBMS_OUTPUT.PUT_LINE('LOOP');
    i := 1;
    LOOP
        DBMS_OUTPUT.PUT_LINE(i);
        i := i + 1;
        EXIT WHEN i > 5;
    END LOOP;

END;
/