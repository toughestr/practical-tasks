-- Задача
-- Получите число пассажиров по длине имени.
-- Нас интересуют только короткие имена (меньше 6 символов).
-- Если пассажиров с заданной длиной имени меньше, чем два –
-- игнорируйте их в результирующей выборке.
-- Отсортируйте данные по количеству пассажиров.
select count(*), length(first_name) from passenger where length(first_name) < 6
group by length(first_name)
having count(*) > 2
order by count(*);