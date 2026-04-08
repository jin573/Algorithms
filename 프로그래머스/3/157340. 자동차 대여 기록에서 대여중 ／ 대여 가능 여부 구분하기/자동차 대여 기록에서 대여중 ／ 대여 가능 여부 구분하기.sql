-- 코드를 입력하세요
SELECT h2.car_id as CAR_ID, 
        case 
            when exists(
                select 1
                from car_rental_company_rental_history h1
                where h1.car_id = h2.car_id
                and '2022-10-16' between h1.start_date and h1.end_date)
            then '대여중'
            else '대여 가능'
        end as AVAILABILITY
from car_rental_company_rental_history h2
group by h2.car_id
order by h2.car_id desc;
