BEGIN
    FOR l IN (
        SELECT customer_id, due_date
        FROM loans
        WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan for Customer ID ' || l.customer_id || ' is due on ' || TO_CHAR(l.due_date, 'DD-MON-YYYY'));
    END LOOP;
END;
/
