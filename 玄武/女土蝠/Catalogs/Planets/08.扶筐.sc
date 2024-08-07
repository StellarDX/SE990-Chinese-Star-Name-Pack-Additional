// Object * 36 Dra  ---  High Proper Motion Star  ---  OID=@311594   (@@9204,6)  ---  coobox=502 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),High Proper Motion Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "36 Dra A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "36 Dra"
	Class           "F5V"
	AbsMagn         3.14
	MassSol         1.23
	RadSol          1.635
	LumBol          4.66
	Teff            6638
	FeH             -0.3
	Age             2.95

	BinaryOrbit     
	{
		Separation      76.4176964223386 // 3.3 asec
	}
}

Star "36 Dra B"
{
	DateUpdated     "2024-06-10"
	ParentBody      "36 Dra"
	Class           "M3"
	AbsMagn         7.4
}

// Object * 42 Dra b  ---  Extra-solar Planet  ---  OID=@4907479   (@@-1,255)  ---  coobox=505
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"42 Dra b/HD 170693b/Orbitar"
{
	ParentBody     "Fafnir"
	DiscMethod     "RadVel"
	DiscDate       "2008"
	MassJup        3.88

	Orbit
	{
		Epoch           2452757.4
		PeriodDays      479.1
		SemiMajorAxis   1.19
		PericenterDist  0.74
		Eccentricity    0.38
		ArgOfPericen    218.7
	}
}