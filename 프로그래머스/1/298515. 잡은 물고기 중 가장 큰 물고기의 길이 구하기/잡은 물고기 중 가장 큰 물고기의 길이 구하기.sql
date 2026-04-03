-- 코드를 작성해주세요
select concat(cast(max(length) as decimal(10, 2)), 'cm') as MAX_LENGTH
from fish_info; 
