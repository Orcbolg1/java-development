-- Count the ratings and then grouping them by ratings.
select rating, count(*)
from sakila.film
Group by rating;

-- the AVG rental rate of the ratings. 
select rating, avg(rental_rate)
From sakila.film
group by rating;

-- renaimng computed fieldsp using as
select rating, avg(rental_rate) AS potato_average
From sakila.film
group by rating;

select rental_id, SUM(amount) as total_amopunt
from sakila.payment
group by rental_id
order by rental_id;


select rating, avg(rental_rate) as avg_rate
From sakila.film
group by rating
order by avg_rate;

-- having clause
select rating, count(*)
From sakila.film
group by rating
having count(*) >= 200
order by rating;
