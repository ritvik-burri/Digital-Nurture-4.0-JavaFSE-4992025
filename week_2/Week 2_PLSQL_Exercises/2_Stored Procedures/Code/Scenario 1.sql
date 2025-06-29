CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    FOR a IN (SELECT account_id, balance FROM accounts WHERE account_type = 'savings') LOOP
        UPDATE accounts
        SET balance = balance + (balance * 0.01)
        WHERE account_id = a.account_id;
    END LOOP;
    COMMIT;
END;
/
