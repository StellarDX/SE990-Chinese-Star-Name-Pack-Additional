// Object * sig Gem  ---  RS CVn Variable  ---  OID=@1003033   (@@21757,0)  ---  coobox=5510 
// Object types: High Proper Motion Star,High Proper Motion Star,Spectroscopic Binary,Double or Multiple Star,Variable Star,RS CVn Variable,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,Radio Source,UV-emission Source,X-ray Source,Transient Event 
Star "SIG Gem A"
{
	DateUpdated     "2024-07-15"
	ParentBody      "SIG Gem"
	Class           "K1IIIe"
	AbsMagn         1.36
	MassSol         1.28
	RadSol          10.1
	LumBol          39
	Teff            4571
	FeH             0.0
	RotationPeriod  467.28
	Age             5

	BinaryOrbit     
	{
		PeriodDays      19.6027
		Separation      0.139094584672404 // 4.63 mas
		Eccentricity    0
		Inclination     107.7
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "SIG Gem B"
{
	DateUpdated     "2024-07-15"
	ParentBody      "SIG Gem"
	Class           ""
	MassSol         0.73
}