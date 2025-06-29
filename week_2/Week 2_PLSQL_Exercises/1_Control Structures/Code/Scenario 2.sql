BEGIN
    FOR c IN (SELECT customer_id FROM customers WHERE balance > 10000) LOOP
        UPDATE customers
        SET IsVIP = 'TRUE'
        WHERE customer_id = c.customer_id;
    END LOOP;
    COMMIT;
END;
/
