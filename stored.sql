SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE display_message IS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Hello, Welcome to PL/SQL Stored Procedures!');
END;
/

BEGIN
    display_message;
END;
/