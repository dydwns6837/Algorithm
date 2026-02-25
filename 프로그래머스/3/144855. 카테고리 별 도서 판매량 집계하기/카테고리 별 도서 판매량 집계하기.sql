-- 코드를 입력하세요
SELECT CATEGORY, sum(SALES) as TOTAL_SALES
from BOOK b, BOOK_SALES s
where b.BOOK_ID = s.BOOK_ID 
and SALES_DATE between '2022-01-01' and '2022-01-31'
group by CATEGORY
order by CATEGORY;