-- 코드를 작성해주세요

select YEAR(e1.differentiation_date) as YEAR, 
(select max(e2.size_of_colony) - e1.size_of_colony
        from ecoli_data e2
        where YEAR(e2.differentiation_date) = YEAR(e1.differentiation_date)) as YEAR_DEV,
e1.id as ID
from ecoli_data e1
order by YEAR, YEAR_DEV asc;