insert into status(name) values('submitted'),('accepted'),('rejected'), ('paid');
insert into allowance(name) values('Wellness'), ('communication'), ('technology'), ('Health');
insert into customer(name) values('Kenny'), ('Max'), ('Tim');

insert into invoice(amount, customer_id, status_id) values(100, 1, 2), (300, 2, 4), (1000.10, 3, 1), (909.50, 1, 1);

insert into customer_allowance( amount, total_amount, allowance_id, customer_id)
 values (505, 1000, 1, 1), (200, 4000, 2, 3), (705, 1400, 3, 1), (50, 100, 2, 2), (50, 800, 3, 3);