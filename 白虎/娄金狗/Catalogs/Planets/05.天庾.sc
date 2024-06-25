// Object * iot02 For  ---  High Proper Motion Star  ---  OID=@1201667   (@@24780,0)  ---  coobox=10929 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "IOT2 For A" {ParentBody "IOT2 For"}
Remove "IOT2 For B" {ParentBody "IOT2 For"}
Star "IOT2 For A"
{
	DateUpdated     "2024-06-25"
	ParentBody      "HIP 12288"
	Class           "F6VFe-0.7CH-0.4"
	AbsMagn         3.08
	MassSol         1.42
	RadSol          1.4
	LumBol          2.900122126431526 // 计算的值
	Teff            6366
	FeH             -0.41
	Age             3.67

	BinaryOrbit     
	{
		Separation      2871.51546006791 // 81.80 asec
		PositionAngle   6
	}
}

// Object * iot02 For B  ---  High Proper Motion Star  ---  OID=@9623392   (@@-1,255)  ---  coobox=10929 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "IOT2 For B/Gaia DR3 5065781335697952000/TIC 122556837/UCAC3 120-5896/UCAC4 300-002651/2MASS J02381928-3010171/** UC 766B/WDS J02383-3012B/HD 16538B/Gaia DR2 5065781335697952000"
{
	DateUpdated     "2024-06-25"
	ParentBody      "HIP 12288"
	Class           ""
	MassSol         0.35
}
