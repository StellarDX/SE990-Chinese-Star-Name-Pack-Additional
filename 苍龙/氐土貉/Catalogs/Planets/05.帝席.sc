// Object * 3 Boo  ---  Spectroscopic Binary  ---  OID=@2192998   (@@46263,20)  ---  coobox=13710 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "3 Boo A"
{
	DateUpdated     "2024-05-26"
	ParentBody      "3 Boo"
	Class           "F2Vp" // A7V:
	AbsMagn         1.21
	MassSol         1.6
	RadSol          2.6
	LumBol          12.605735498503337 // 计算的值
	Teff            6745
	Age             1.5

	BinaryOrbit     
	{
		PeriodDays      36.006
		Eccentricity    0.543
		Inclination     74.5
	}
}

Star "3 Boo B"
{
	DateUpdated     "2024-05-26"
	ParentBody      "3 Boo"
	Class           "G0IV" // G5III:
	MassSol         1.8
	RadSol          3.7
	LumBol          14.425357408071122 // 计算的值
	Teff            5848
}