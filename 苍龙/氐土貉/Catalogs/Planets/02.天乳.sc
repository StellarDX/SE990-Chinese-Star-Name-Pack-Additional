// Object * 25 Ser  ---  Spectroscopic Binary  ---  OID=@2634317   (@@49629,8)  ---  coobox=16852 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "25 Ser A"
{
	DateUpdated     "2024-05-25"
	ParentBody      "25 Ser"
	Class           "B8IV/V"
	AbsMagn         -0.23 // 计算的值
	MassSol         4.1
	Radius          2336940.30906253 // 计算的值
	LumBol          383
	Teff            13932 

	BinaryOrbit     
	{
		PeriodDays      38.927
		Eccentricity    0.731
		Epoch           2450132.80
		ArgOfPericenter 21.8
		MeanAnomaly     0
	}
}

Star "25 Ser B"
{
	ParentBody      "25 Ser"
	Class           "F0.3?"
}